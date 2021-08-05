package org.springframework.samples.petclinic.repository.jdbc;

import org.springframework.data.jdbc.core.OneToManyResultSetExtractor;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.samples.petclinic.model.Visit;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * {@link ResultSetExtractor} implementation by using the
 * {@link OneToManyResultSetExtractor} of Spring Data Core JDBC Extensions.
 */
public class JdbcPetVisitExtractor extends
    OneToManyResultSetExtractor<JdbcPet, Visit, Integer> {

    public JdbcPetVisitExtractor() {
        super(new JdbcPetRowMapper(), new JdbcVisitRowMapper());
    }

    @Override
    protected Integer mapPrimaryKey(ResultSet rs) throws SQLException {
        return rs.getInt("pets.id");
    }

    @Override
    protected Integer mapForeignKey(ResultSet rs) throws SQLException {
        if (rs.getObject("visits.pet_id") == null) {
            return null;
        } else {
            return rs.getInt("visits.pet_id");
        }
    }

    @Override
    protected void addChild(JdbcPet root, Visit child) {
        root.addVisit(child);
    }
}
