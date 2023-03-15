package com.spring.proj1.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
// import jakarta.annotation.Generated;
// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="tbl_employee")
public class employeemodel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
    // @JsonProperty("full_name")
	@Column(name="name")
	@NotNull(message = "name should not be null")
	@NotBlank
    private String name;

    // @JsonIgnore
	@Column(name="age")
	private Long age = 0L;
	@Column(name="location")
	@NotBlank
	private String Location;
	@Column(name="email")
	@Email(message = "please enter valid email address")
	private String email;
	@Column(name="department")
	@NotBlank
	@NotNull(message = "name should not be null")
	private String department;
    
}
