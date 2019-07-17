package ru.vsd.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.vsd.model.Movie;

import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Movie> allMovies() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Movie").list();
    }

    @Override
    public void add(Movie movie) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(movie);
    }

    @Override
    public void delete(Movie movie) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(movie);
    }

    @Override
    public void edit(Movie movie) {
        Session session = sessionFactory.getCurrentSession();
        session.update(movie);
    }

    @Override
    public Movie getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Movie.class, id);
    }
}
