package ifmo.drukhary.StudyGroupsApp.DTO.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeleteAllByStudentCountResponse {
    long countDeleted;
}
