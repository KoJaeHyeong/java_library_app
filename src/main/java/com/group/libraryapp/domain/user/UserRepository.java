package com.group.libraryapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// JPA는 상속해서 사용하기 때문에 @Repository를 안해줘도 빈으로 등록 된다.
public interface UserRepository extends JpaRepository<User, Long> {

    // SELECT * FROM user WHERE name = ?
    Optional<User> findByName(String name); // 반환 타입 User 이고, 없으면 null이 반환된다. 함수 이름만 작성하면, 알아서 SQL이 조립된다.

    Long countByAge(Integer age);

    List<User> findAllByAge(Integer age);
}
