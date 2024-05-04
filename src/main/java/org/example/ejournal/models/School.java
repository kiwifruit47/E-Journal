package org.example.ejournal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "schools")
public class School extends BasicEntity {

    @Column(length = 20, nullable = false, unique = true)
    private String name;

    @Column(length = 50, nullable = false)
    private String address;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Teacher> teachers;

    @OneToOne(mappedBy = "school", targetEntity = Headmaster.class)
    private Headmaster headmaster;

    @OneToMany(mappedBy = "school", targetEntity = Student.class, fetch = FetchType.EAGER)
    private Set<Student> students;

    @OneToMany(mappedBy = "school", targetEntity = Parent.class, fetch = FetchType.EAGER)
    private Set<Parent> parents;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Subject> subjects;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", teachers=" + teachers +
                ", headmaster=" + headmaster +
                ", students=" + students +
                ", parents=" + parents +
                ", subjects=" + subjects +
                '}';
    }
}
