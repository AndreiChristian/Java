package com.andreichristian.spring6webapp.bootstrap;

import com.andreichristian.spring6webapp.domain.Author;
import com.andreichristian.spring6webapp.domain.Book;
import com.andreichristian.spring6webapp.domain.Publisher;
import com.andreichristian.spring6webapp.repositories.AuthorRepository;
import com.andreichristian.spring6webapp.repositories.BookRepository;
import com.andreichristian.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("3456789");

        eric = authorRepository.save(eric); // save and reassign to capture any automatic database updates (like generated ids)
        ddd = bookRepository.save(ddd); // save and reassign for the same reason

        Author jesse = new Author();
        jesse.setFirstName("Herman");
        jesse.setLastName("Jesse");

        Book jcm = new Book();
        jcm.setTitle("Jocul");
        jcm.setIsbn("27237323");

        jesse = authorRepository.save(jesse); // save and reassign
        jcm = bookRepository.save(jcm); // save and reassign

        Publisher humanitas = new Publisher();
        humanitas.setPublisherName("Humanitas");
        humanitas.setAddress("Strada X");
        humanitas.setCity("Bucuresti");
        humanitas.setZip("1234");
        humanitas.setState("Bucuresti");

        humanitas = publisherRepository.save(humanitas); // save and reassign

        ddd.setPublisher(humanitas);
        jcm.setPublisher(humanitas);

        ddd = bookRepository.save(ddd); // save after setting publisher
        jcm = bookRepository.save(jcm); // save after setting publisher

        eric.getBooks().add(ddd);
        jesse.getBooks().add(jcm);

        // save authors after adding books
        authorRepository.save(eric);
        authorRepository.save(jesse);

        System.out.println("Bootstrapping data...");
        System.out.println("Author count : " + authorRepository.count());
        System.out.println("Book count : " + bookRepository.count());
        System.out.println("Publisher count : " + publisherRepository.count());
    }


}