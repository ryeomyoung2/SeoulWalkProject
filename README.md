## Project

 **서울 둘레길 코스 정보/추천 사이트 프로젝트**  
- **작업툴**: Spring Tool Suite (4.16.1), vscode (1.74.3)
- **데이터베이스**: MySql
- **서버 배포**: AWS Lightsail
- **사용 언어**: Java17
- **사용 프레임워크**: SpringBoot (3.0.1), Thymeleaf
- **인원**: 3명 (황지훈, 한유경, 임여명)
- **기간**: 2022.12.16 - 2023.01.27  
- **내용**
  - 둘레길 산책을 좋아하거나 취미로 새로 유입되는 서울 시민들을 위해 서울 둘레길의 정보를 제공하는 웹페이지 제작
- 폴더명: SeoulWalkProject
- [최종PDF](https://github.com/ryeomyoung2/SeoulWalkProject/blob/main/SeoulWalk/Seoul%20Walk.pdf)
- [시연영상](https://www.youtube.com/watch?v=FQA0DWPVtXA)

**주요기능** 
- **메인화면**

   <img src="https://user-images.githubusercontent.com/115764986/216860479-51b211c0-8e9f-4056-96f3-33a9d99999ba.jpg"  width="600" height="480">

- **둘레길 코스**
  - 서울 둘레길 코스 시각화 : 네이버 map api를 사용하여 지도 표시
  - DB(경도, 위도) - Controller - Javascript 를 통해 경로 시각화

   ![2](https://user-images.githubusercontent.com/115764986/216862469-43fe4edc-c41c-4814-88cd-0f65d68a4e7a.gif)
 
 <br><br><br><br>

 - **추천 코스**
   - 코스 리뷰 : 각 코스별 리뷰 게시판 구현, Ajax를 사용한 비동기 페이징 구현

    ![3](https://user-images.githubusercontent.com/115764986/216863688-d00bf619-07be-489e-b25f-77acf7ed2079.gif)

 <br><br><br><br>

 - **둘레길 유형 테스트**
   - 유형 테스트 -> 8가지 질문을 통해 코스 추천
   - 테스트 결과를 sns로 공유

    ![4](https://user-images.githubusercontent.com/115764986/216865478-c982c47e-9862-4bf7-9f5a-5284864e33bd.gif)
 
 <br><br><br><br> 
 
 - **그밖의 길**
   - JPA를 활용하여 지역/코스길이/시간/난이도 별 산책로 목록 검색
   
    ![5](https://user-images.githubusercontent.com/115764986/216866081-9edd7d6f-b365-409c-9742-b6d76f7250ac.gif)
   
 <br><br><br><br>

 - **커뮤니티**
   - 공지사항 : 관리자 계정만 사용 가능하도록 접근 제한
   - 커뮤니티 : CRUD기능, 추천, JPA를 활용한 게시글 페이징과 검색
   
    ![6](https://user-images.githubusercontent.com/115764986/216868847-c178f9cc-b272-4ad1-97f0-592f6aacf297.gif)
 
  <br><br><br><br>
 
  - **소셜 로그인**
    - 소셜 로그인 : OAUTH2.0 라이브러리 사용, 로그인 시 세션(Session) 생성
    - 접근 제한 : 세션값을 검증하여 로그인 페이지로 이동, 로그인 시 이전 페이지로 이동
   
    ![6](https://user-images.githubusercontent.com/115764986/216868847-c178f9cc-b272-4ad1-97f0-592f6aacf297.gif)
