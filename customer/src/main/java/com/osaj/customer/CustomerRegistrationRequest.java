package com.osaj.customer;

public record CustomerRegistrationRequest(String firstName,
                                          String lastName,
                                          String email) {
}
