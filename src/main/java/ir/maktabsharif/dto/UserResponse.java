package ir.maktabsharif.dto;

public record UserResponse(
        Long id,
        String username,
        String fullName,
        Short age
) {
}
