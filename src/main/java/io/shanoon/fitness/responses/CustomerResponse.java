package io.shanoon.fitness.responses;

import io.shanoon.fitness.models.Gender;

public record CustomerResponse(String name, Gender gender, Integer cashPaid) {
}
