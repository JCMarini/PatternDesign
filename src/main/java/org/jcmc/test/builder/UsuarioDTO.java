package org.jcmc.test.builder;

import java.util.Date;
import java.util.Objects;

public class UsuarioDTO {

    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;
    public String direction;
    public Date dateOfBorn;

    public UsuarioDTO(String firstName, String lastName,
                      String phoneNumber, String email, String direction,
                      Date dateOfborn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.direction = direction;
        this.dateOfBorn = dateOfborn;
    }

    public UsuarioDTO(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.direction = builder.direction;
        this.dateOfBorn = builder.dateOfBorn;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String email;
        private String direction;
        private Date dateOfBorn;

        public String getFirstName() {
            return firstName;
        }

        public UsuarioDTO.Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public UsuarioDTO.Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public UsuarioDTO.Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public UsuarioDTO.Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getDirection() {
            return direction;
        }

        public UsuarioDTO.Builder setDirection(String direction) {
            this.direction = direction;
            return this;
        }

        public Date getDateOfBorn() {
            return dateOfBorn;
        }

        public UsuarioDTO.Builder setDateOfBorn(Date dateOfBorn) {
            this.dateOfBorn = dateOfBorn;
            return this;
        }

        public UsuarioDTO build() {
            // aqui podemos agregar logica que valide la informacion para creacion
            //del objetto UsuarioDTO

            Objects.requireNonNull(firstName);
            if (firstName == null) {
                firstName = "";
            }

            return new UsuarioDTO(this);
        }

    }
}
