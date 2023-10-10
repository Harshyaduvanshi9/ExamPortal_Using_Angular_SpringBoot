package com.examportal.exam.Model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    private Long rolId;
    private String roleName;
    @OneToMany(cascade = CascadeType.ALL,fetch =FetchType.LAZY,mappedBy = "role" )

    private Set<UserRole>userRoles=new HashSet<>();
    public Role(Long rolId, String roleName) {
        this.rolId = rolId;
        this.roleName = roleName;
    }
    public Role() {
    }
    public Long getRolId() {
        return rolId;
    }
    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public Set<UserRole> getUserRoles() {
        return userRoles;
    }
    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }



    
    
}
