package signatureChange;

public class AuthenticationService {
    private Id masterKey = new Id(12345);

    public boolean isAuthenticated(Id id) {
        return id.is(masterKey);
    }

    public boolean isAuthenticated(int id) {
        return id == 12345;
    }
}
