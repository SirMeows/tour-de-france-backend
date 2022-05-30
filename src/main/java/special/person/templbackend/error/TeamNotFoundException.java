package special.person.templbackend.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class TeamNotFoundException extends ResponseStatusException {

    private static final String MESSAGE_ID = "Team with id '%x' not found";

    public TeamNotFoundException(Long id) {
        super(HttpStatus.NOT_FOUND, String.format(MESSAGE_ID, id));
    }
}
