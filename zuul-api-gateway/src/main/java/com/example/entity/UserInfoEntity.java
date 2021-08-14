package com.example.entity;


	public class UserInfoEntity {

		
		private Long id;
		private String name;
		private String password;
		private String role;
		private boolean active;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		@Override
		public String toString() {
			return "UserInfoEntity [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + ", active="
					+ active + "]";
		}
		public UserInfoEntity(Long id, String name, String password, String role, boolean active) {
			
			this.id = id;
			this.name = name;
			this.password = password;
			this.role = role;
			this.active = active;
		}
		public UserInfoEntity() {
					
		}
		
	}


