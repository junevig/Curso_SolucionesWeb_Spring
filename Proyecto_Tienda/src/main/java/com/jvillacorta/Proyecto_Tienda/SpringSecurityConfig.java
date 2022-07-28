package com.jvillacorta.Proyecto_Tienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.jvillacorta.Proyecto_Tienda.service.UsuarioService;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UsuarioService usuarioService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(usuarioService).passwordEncoder(passwordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(
				"/",
				"/css/**",
				"/js/**",
				"/images/**", 
				"/webfonts/**", 
				"/datatable/**").permitAll()
		.antMatchers("/categoria/formulario", "/categoria/eliminar/**").hasRole("ADMIN")
		.antMatchers("/categoria/lista").hasAnyRole("USER", "ADMIN")
		.anyRequest().authenticated()
		.and().formLogin().loginPage("/").defaultSuccessUrl("/principal/").permitAll()
		.and().logout().permitAll()
		;
	}
}
