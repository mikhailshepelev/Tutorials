package org.springframework.samples.petclinic.repository.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 * {@link RowMapper} implementation mapping data from a {@link ResultSet} to the corresponding properties
 * of the {@link JdbcPet} class.
 */
class JdbcPetRowMapper implements RowMapper<JdbcPet> {

    @Override
    public JdbcPet mapRow(ResultSet rs, int rownum) throws SQLException {
        JdbcPet pet = new JdbcPet();
        pet.setId(rs.getInt("pets.id"));
        pet.setName(rs.getString("name"));
        pet.setBirthDate(rs.getObject("birth_date", LocalDate.class));
        pet.setTypeId(rs.getInt("type_id"));
        pet.setOwnerId(rs.getInt("owner_id"));
        return pet;
    }
}
