package com.group.libraryapp.domain.user;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tabel 생성 시 auto-increment를 설정 해주었기 때문에 IDENTITY속성
    private Long id = null;

    @Column(nullable = false, length = 20)
    private String name;

    // Column어노테이션은 생략 할 수 있다. 굳이 어떠한 설정을 할 필요 없을때!
    private Integer age;

    protected User() {
    } // JPA를 사용하기 위해서는 기본 생성자가 필요하다.

    public User(String name, Integer age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.", name));
        }
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void updateName(String name) {
        this.name = name;
    }
}
