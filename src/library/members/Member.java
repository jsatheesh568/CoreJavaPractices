package CoreJavaPractices.src.library.members;

public sealed interface Member permits StudentMember, FacultyMember {
   public String getId();
    public String getName();
}


