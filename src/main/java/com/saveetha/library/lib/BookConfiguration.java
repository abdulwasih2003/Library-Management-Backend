package com.saveetha.library.lib;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class BookConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository) {
        return args -> {

            Book b1 = new Book(
                    1L,
                    "Head First C",
                    "David Griffiths",
                    10
            );
            Book b2 = new Book(
                    2L,
                    "Head First Java",
                    "Bert Bates and Kathy Sierra",
                    15
            );
            Book b3 = new Book(
                    3L,
                    "Machine Learning for Absolute Beginners",
                    "Oliver Theobald",
                    15
            );
            Book b4 = new Book(
                    4L,
                    " Modern Full-Stack Development",
                    "Frank W. Zammetti",
                    10
            );
            Book b5 = new Book(
                    5L,
                    "Clean Code",
                    "Robert C. Martin",
                    12
            );
            Book b6 = new Book(
                    6L,
                    "Introduction to Algorithms",
                    "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein",
                    13
            );
            Book b7 = new Book(
                    7L,
                    "Design Patterns",
                    "Erich Gamma, Richard Helm",
                    8
            );
            Book b8 = new Book(
                    8L,
                    "Head First Design Patterns",
                    "Eric Freeman, Bert Bates",
                    3
            );
            Book b9 = new Book(
                    9L,
                    "The Pragmatic Programmer",
                    "Andrew Hunt, David Thomas",
                    25
            );
            Book b10 = new Book(
                    10L,
                    "The Art of Computer Programming",
                    "Donald E. Knuth",
                    10
            );
            bookRepository.saveAll(List.of(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10));
        };
    }

    @Configuration
    public class CORSConfiguration implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("http://localhost:3000")
                    .allowedMethods("GET", "POST", "PUT", "DELETE")
                    .allowedHeaders("*");
        }
    }
}