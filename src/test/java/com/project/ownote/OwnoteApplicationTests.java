package com.project.ownote;

import com.project.ownote.annual.service.AnnualService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OwnoteApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private AnnualService annualService;

    @Test
    public void testFindEmpNameById() {
        int empId = 2; // 테스트할 empId 값
        String empName = annualService.findEmpNameById(empId);
        // 여기에서 empName 값과 예상하는 값 비교 (Assertions.assertEquals 등을 사용)
        // 실패한 경우 테스트 케이스를 통과하도록 서비스 메서드 수정
    }
}
