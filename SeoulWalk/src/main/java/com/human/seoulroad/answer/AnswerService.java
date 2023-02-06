package com.human.seoulroad.answer;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.human.seoulroad.DataNotFoundException;
import com.human.seoulroad.question.Question;
import com.human.seoulroad.user.SiteUser;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {
	
	private final AnswerRepository answerRepository;

	// 답변 생성 매서드
    public Answer create(Question question, String content, SiteUser author) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        answer.setAuthor(author);
        this.answerRepository.save(answer);
        return answer;
    }
    
    // 답변 조회 메서드
    // 답변을 추천, 수정, 삭제하기 위해 본인의 ID와 같은지 검사가 필요
    public Answer getAnswer(Integer id) {
        Optional<Answer> answer = this.answerRepository.findById(id);
        if (answer.isPresent()) {
            return answer.get();
        } else {
            throw new DataNotFoundException("answer not found");
        }
    }
    
    // 답변 수정 메서드
    public void modify(Answer answer, String content) {
        answer.setContent(content);
        answer.setModifyDate(LocalDateTime.now());
        this.answerRepository.save(answer);
    }
    
    // 답변 삭제 메서드
    public void delete(Answer answer) {
        this.answerRepository.delete(answer);
    }
    
    // 답변 추천 메서드
    public void vote(Answer answer, SiteUser siteUser) {
    	answer.getVoter().add(siteUser);
        this.answerRepository.save(answer);
    }
    
    // 답변 추천 취소 메서드
    public void votedel(Answer answer, SiteUser siteUser) {
    	answer.getVoter().remove(siteUser);
    	this.answerRepository.save(answer);
    }
}
