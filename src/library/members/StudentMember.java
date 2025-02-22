package CoreJavaPractices.src.library.members;

public record StudentMember(String id, String name) implements Member {
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
