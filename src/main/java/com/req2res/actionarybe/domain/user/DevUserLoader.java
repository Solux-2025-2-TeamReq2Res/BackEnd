//package com.req2res.actionarybe.domain.user;
//
//import com.req2res.actionarybe.domain.user.entity.User;
//import com.req2res.actionarybe.domain.user.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Profile;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//
//////////////// 처음에 Security Test하려고 만든 파일 /////////////
///// 임시로 유저 한명 넣어보는 것 ///
//@Component
//@Profile("!prod")
//@RequiredArgsConstructor
//public class DevUserLoader implements CommandLineRunner {
//    private final UserRepository repo;
//    private final PasswordEncoder encoder;
//
//    @Override
//    public void run(String... args) {
//        if (repo.findByLoginId("user123456").isEmpty()) {
//            repo.save(User.builder()
//                    .loginId("user123456")
//                    .password(encoder.encode("password123"))
//                    .name("사용자이름")
//                    .email("user@example.com")
//                    .phoneNumber("010-1234-5678")
//                    .birthday(LocalDate.of(2000,1,1))
//                    .imageUrl("http://.../default_profile.png")
//                    .nickname("유저1234")
//                    .build());
//        }
//    }
//}
