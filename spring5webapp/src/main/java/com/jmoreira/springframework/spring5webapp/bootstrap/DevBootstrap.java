package com.jmoreira.springframework.spring5webapp.bootstrap;

import com.jmoreira.springframework.spring5webapp.model.Author;
import com.jmoreira.springframework.spring5webapp.model.Book;
import com.jmoreira.springframework.spring5webapp.model.Publisher;
import com.jmoreira.springframework.spring5webapp.repositories.AuthorRepository;
import com.jmoreira.springframework.spring5webapp.repositories.BookRepository;
import com.jmoreira.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
                        PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData() {
        Publisher harper = new Publisher("Harper Collins", "AddressA");
        publisherRepository.save(harper);
        // Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", harper);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Publisher worx = new Publisher("Worx", "AddressA");
        publisherRepository.save(worx);
        // Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", worx);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}