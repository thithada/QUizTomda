import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestRisk {

    @Test
    void testIsTargetAgeGroup() {
        QuizRisk.Patient patient1 = new QuizRisk.Patient(20, 120, 100);
        QuizRisk.Patient patient2 = new QuizRisk.Patient(10, 120, 100);

        assertTrue(patient1.isTargetAgeGroup());//มากกว่า 15
        assertFalse(patient2.isTargetAgeGroup());//น้อยกว่า 15
    }

    @Test
    void testGetBloodPressureCategory() {
        QuizRisk.Patient patient1 = new QuizRisk.Patient(30, 110, 100);
        QuizRisk.Patient patient2 = new QuizRisk.Patient(30, 130, 100);
        QuizRisk.Patient patient3 = new QuizRisk.Patient(30, 140, 100);

        assertEquals(QuizRisk.RiskCategory.NORMAL, patient1.getBloodPressureCategory());
        assertEquals(QuizRisk.RiskCategory.RISK, patient2.getBloodPressureCategory());
        assertEquals(QuizRisk.RiskCategory.HIGH_RISK, patient3.getBloodPressureCategory());
    }

    @Test
    void testGetBloodPressureSeverity() {
        QuizRisk.Patient patient1 = new QuizRisk.Patient(30, 130, 100);
        QuizRisk.Patient patient2 = new QuizRisk.Patient(30, 150, 100);
        QuizRisk.Patient patient3 = new QuizRisk.Patient(30, 170, 100);
        QuizRisk.Patient patient4 = new QuizRisk.Patient(30, 190, 100);

        assertEquals(QuizRisk.HighRiskLevel.LEVEL_0, patient1.getBloodPressureSeverity());
        assertEquals(QuizRisk.HighRiskLevel.LEVEL_1, patient2.getBloodPressureSeverity());
        assertEquals(QuizRisk.HighRiskLevel.LEVEL_2, patient3.getBloodPressureSeverity());
        assertEquals(QuizRisk.HighRiskLevel.LEVEL_3, patient4.getBloodPressureSeverity());
    }

    @Test
    void testGetBloodSugarCategory() {
        QuizRisk.Patient patient1 = new QuizRisk.Patient(30, 120, 90);
        QuizRisk.Patient patient2 = new QuizRisk.Patient(30, 120, 110);
        QuizRisk.Patient patient3 = new QuizRisk.Patient(30, 120, 130);

        assertEquals(QuizRisk.RiskCategory.NORMAL, patient1.getBloodSugarCategory());
        assertEquals(QuizRisk.RiskCategory.RISK, patient2.getBloodSugarCategory());
        assertEquals(QuizRisk.RiskCategory.HIGH_RISK, patient3.getBloodSugarCategory());
    }

    @Test
    void testGetBloodSugarSeverity() {
        QuizRisk.Patient patient1 = new QuizRisk.Patient(30, 120, 120);
        QuizRisk.Patient patient2 = new QuizRisk.Patient(30, 120, 130);
        QuizRisk.Patient patient3 = new QuizRisk.Patient(30, 120, 170);
        QuizRisk.Patient patient4 = new QuizRisk.Patient(30, 120, 190);

        assertEquals(QuizRisk.HighRiskLevel.LEVEL_0, patient1.getBloodSugarSeverity());
        assertEquals(QuizRisk.HighRiskLevel.LEVEL_1, patient2.getBloodSugarSeverity());
        assertEquals(QuizRisk.HighRiskLevel.LEVEL_2, patient3.getBloodSugarSeverity());
        assertEquals(QuizRisk.HighRiskLevel.LEVEL_3, patient4.getBloodSugarSeverity());
    }

    @Test
    void testAnalyzeHealthRisk() {
        QuizRisk.Patient patient = new QuizRisk.Patient(16, 120, 130);
        
        patient.analyzeHealthRisk();
    }
}
