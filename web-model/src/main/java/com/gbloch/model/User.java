package com.gbloch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User entity
 * <br>
 * Created on 27/02/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    private String firstName;
    private String lastName;
    private String email;
}
