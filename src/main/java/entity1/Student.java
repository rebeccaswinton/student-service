
package entity1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "Student")
public class Student {

@Id
private int id;

@Column
private String firstName;
@Column
private String lastName;
@Column
private String dob;
@Column
private String subject;


}