import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestRisk {

    @Test
    void testIsTargetAgeGroup() {
        QuizRisk.Patient patient1 = new QuizRisk.Patient(30, 120, 100);
        assertTrue(patient1.isTargetAgeGroup());//มากกว่า 15
    }

    @Test
    void testGetBloodPressureCategory() {
        QuizRisk.Patient patient1 = new QuizRisk.Patient(30, 135, 100);
        assertEquals(QuizRisk.RiskCategory.RISK, patient1.getBloodPressureCategory());
    }

    @Test
    void testGetBloodPressureSeverity() {
        QuizRisk.Patient patient1 = new QuizRisk.Patient(30, 140, 100);
        assertEquals(QuizRisk.HighRiskLevel.LEVEL_1, patient1.getBloodPressureSeverity());
    }

    @Test
    void testGetBloodSugarCategory() {
        QuizRisk.Patient patient1 = new QuizRisk.Patient(30, 130, 120);
        assertEquals(QuizRisk.RiskCategory.RISK, patient1.getBloodSugarCategory());
    }

    @Test
    void testGetBloodSugarSeverity() {
        QuizRisk.Patient patient1 = new QuizRisk.Patient(30, 120, 120);
        assertEquals(QuizRisk.HighRiskLevel.LEVEL_0, patient1.getBloodSugarSeverity());
    }

    @Test
    void testAnalyzeHealthRisk() {
        QuizRisk.Patient patient = new QuizRisk.Patient(20, 135, 120);
        patient.analyzeHealthRisk();
    }
}
