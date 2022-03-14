package com.MyMoviePlan.entity;

import com.MyMoviePlan.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "users")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(length = 50)
    private String name;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(nullable = false, length = 10, unique = true)
    private String mobile;

    @Column(length = 60)
    private String gender;

    private String password;

    private Boolean terms;

    @Column(name = "is_account_non_expired")
    private Boolean isAccountNonExpired;

    @Column(name = "is_account_non_locked")
    private Boolean isAccountNonLocked;

    @Column(name = "is_credentials_non_expired")
    private Boolean isCredentialsNonExpired;

    @Column(name = "is_enabled")
    private Boolean isEnabled;

    @Column(name = "user_role", length = 20)
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public void UserEntity(String name, String email, String mobile, String gender, String password, Boolean terms,
                      Boolean isAccountNonExpired, Boolean isAccountNonLocked,
                      Boolean isCredentialsNonExpired, Boolean isEnabled, UserRole userRole) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.password = password;
        this.terms = terms;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
        this.userRole = userRole;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getTerms() {
		return terms;
	}

	public void setTerms(Boolean terms) {
		this.terms = terms;
	}

	public Boolean getIsAccountNonExpired() {
		return isAccountNonExpired;
	}

	public void setIsAccountNonExpired(Boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	public Boolean getIsAccountNonLocked() {
		return isAccountNonLocked;
	}

	public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	public Boolean getIsCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	public void setIsCredentialsNonExpired(Boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public Object setAccountNonExpired(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

//  


}
