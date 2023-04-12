package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    MovieManager manager = new MovieManager();

    @Test
    public void addMovie() {

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");
        manager.add("movie6");
        manager.add("movie7");

        String[] expected = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findAll() {

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");
        manager.add("movie6");
        manager.add("movie7");

        String[] expected = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast() {

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");
        manager.add("movie6");
        manager.add("movie7");

        String[] expected = {"movie7", "movie6", "movie5", "movie4", "movie3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLessThat5 () {

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");

        String[] expected = {"movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimit() {
        MovieManager manager = new MovieManager(3);

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");

        String[] expected = {"movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }
}
