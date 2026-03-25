package ie.atu.oopsem2lab7.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "reservation-client", url = "http://localhost:8080")
public interface ReservationClient {

    @GetMapping("/borrow/{id}")
    ReservationResponse getReservationById(@PathVariable Long id);

    class ReservationResponse {
        private Long loanId;
        private Long loanTag;
        private String loanName;
        private Double loanRate;
        private Integer loanPeriod;
        private String email;

        public ReservationResponse() {
        }

        public Long getLoanId() {
            return loanId;
        }

        public void setLoanId(Long loanId) {
            this.loanId = loanId;
        }

        public Long getLoanTag() {
            return loanTag;
        }

        public void setLoanTag(Long loanTag) {
            this.loanTag = loanTag;
        }

        public String getLoanName() {
            return loanName;
        }

        public void setLoanName(String loanName) {
            this.loanName = loanName;
        }

        public Double getLoanRate() {
            return loanRate;
        }

        public void setLoanRate(Double loanRate) {
            this.loanRate = loanRate;
        }

        public Integer getLoanPeriod() {
            return loanPeriod;
        }

        public void setLoanPeriod(Integer loanPeriod) {
            this.loanPeriod = loanPeriod;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}