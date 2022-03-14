package com.MyMoviePlan.security;

import com.MyMoviePlan.entity.UserEntity;
import com.MyMoviePlan.model.UserRole;

import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ApplicationUserDetails implements UserDetails {

    private UserEntity userEntity;

    public ApplicationUserDetails(UserEntity userEntity2) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        final List<SimpleGrantedAuthority> authorities = userEntity.getUserRole()
                .getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(((Enum<UserRole>) permission).name()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority(userEntity.getUserRole().name()));
        return authorities;
    }

    @Override
    public String getPassword() {
        return userEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return userEntity.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return userEntity.getIsAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return userEntity.getIsAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return userEntity.getIsCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return userEntity.getIsEnabled();
    }
}
