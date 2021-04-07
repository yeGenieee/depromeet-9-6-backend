# depromeet-9-6-backend(article-reminder?)
- 디프만 9기 6조 백엔드 https://www.notion.so/depromeet/6-7508bdb9345c45a4a6836e446f35a7a9 
- 아이디어 회의 https://www.notion.so/depromeet/3-27-12320b2b806849d8a00d99240e5472d9
- 기술스택 회의 https://www.notion.so/depromeet/Backend-7bd3b3b7934c47c8b8373d4c92bc2aa6

사용 기술
---
- Spring-boot
- Java
- Junit
- Swagger
- mysql
- jpa
- Gradle Project

요구 사항
---
- 소셜 로그인 Oauth2.0 (카카오, 네이버)정도 로그인?
- 링크 저장 
- 해시 태그 필터링 및 카테고리 기능
- 알람
- 아티클 완료시 레벨 설정
- 추천 아티클 개인화 아티클로 최근 관심있게 태그한 카테고리 위주로 앱 상단에 조회

개발 순서
---
- DB ERD
- 시퀀스 다이어그램
- API 설계
- 로그인(Oauth 2.0, Kakao 로그인api)
- 링크 저장
- 푸시 알림
- 리워드
- 추천 아티클
 
UML
---

ERD (아직 수정 완료 버전 아니에요!!)
---

[comment]: <> (![image]&#40;https://user-images.githubusercontent.com/61732452/113483724-e1b0a480-94df-11eb-9b3b-26e3e9db7d01.png&#41;)
![image](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/39fe33d4-6c65-4525-aae6-bc986e350fdb/Link_collector_real_20210408_23_01.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210407%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210407T222438Z&X-Amz-Expires=86400&X-Amz-Signature=8e151fd979e6955eff3d96502882cddf05d2f2791c81d4c4e7fbba3c9b9b901c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Link_collector_real_20210408_23_01.png%22)