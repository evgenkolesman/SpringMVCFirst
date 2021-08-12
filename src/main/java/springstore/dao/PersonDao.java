package springstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import springstore.models.Person;

import java.util.List;

@Component
public class PersonDao {

    private final JdbcTemplate jdbcTeamplate;

    @Autowired
    public PersonDao(JdbcTemplate jdbcTeamplate) {
        this.jdbcTeamplate = jdbcTeamplate;
    }

    public List<Person> index() {
        return jdbcTeamplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Person show(int id) {
        return jdbcTeamplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class))
                .stream().findAny().orElse(null);
    }

    public void save(Person person) {
        jdbcTeamplate.update("INSERT INTO Person VALUES (?, ?, ?, ?)",
                person.getId(), person.getName(), person.getAge(), person.getEmail());
    }

    public void update(int id, Person updatedPerson) {
        jdbcTeamplate.update("UPDATE Person set name = ?, age = ?, email = ? WHERE id =?;",
                updatedPerson.getName(), updatedPerson.getAge(), updatedPerson.getEmail(), id);
    }

    public void delete(int id) {
        jdbcTeamplate.update("DELETE FROM Person WHERE id = ?;", id);
    }
}
