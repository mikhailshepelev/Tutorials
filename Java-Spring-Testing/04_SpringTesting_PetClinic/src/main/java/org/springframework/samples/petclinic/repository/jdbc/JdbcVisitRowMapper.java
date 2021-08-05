package org.springframework.samples.petclinic.repository.jdbc;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.samples.petclinic.model.Visit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 * {@link RowMapper} implementation mapping data from a {@link ResultSet} to the corresponding properties
 * of the {@link Visit} class.
 */
class JdbcVisitRowMapper implements RowMapper<Visit> {

    @Override
    public Visit mapRow(ResultSet rs, int row) throws SQLException {
        Visit visit = new Visit();
        visit.setId(rs.getInt("visit_id"));
        visit.setDate(rs.getObject("visit_date", LocalDate.class));
        visit.setDescription(rs.getString("description"));
        return visit;
    }
}
