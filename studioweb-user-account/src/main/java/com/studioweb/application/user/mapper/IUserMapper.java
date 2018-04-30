/**
 * 
 */
package com.studioweb.application.user.mapper;

/**
 * @author MXA86SG
 *
 */
public interface IUserMapper <R, T> {
	
	public R mapToResponse(T t);

}
