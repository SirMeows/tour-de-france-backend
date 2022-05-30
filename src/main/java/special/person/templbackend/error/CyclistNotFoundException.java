package special.person.templbackend.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CyclistNotFoundException extends ResponseStatusException {

    private static final String MESSAGE_ID = "Cyclist with id '%x' not found";
    private static final String MESSAGE_SEARCH_TERM = "Cyclist with searchTerm '%s' not found";

    public CyclistNotFoundException(Long id) {
        super(HttpStatus.NOT_FOUND, String.format(MESSAGE_ID, id));
    }

    public CyclistNotFoundException(String searchTerm) {
        super(HttpStatus.NOT_FOUND, String.format(MESSAGE_SEARCH_TERM, searchTerm));
    }
}
