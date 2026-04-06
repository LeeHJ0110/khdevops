-- 5G
INSERT INTO DATA_SPEED (SPEED, DONE_SPEED) VALUES('5G', '400Kbps');
INSERT INTO DATA_SPEED (SPEED, DONE_SPEED) VALUES('5G', '1Mbps');
INSERT INTO DATA_SPEED (SPEED, DONE_SPEED) VALUES('5G', '3Mbps');
INSERT INTO DATA_SPEED (SPEED, DONE_SPEED) VALUES('5G', '5Mbps');
INSERT INTO DATA_SPEED (SPEED, DONE_SPEED) VALUES('5G', '무제한');

-- LTE
INSERT INTO DATA_SPEED (SPEED, DONE_SPEED) VALUES('LTE', '400Kbps');
INSERT INTO DATA_SPEED (SPEED, DONE_SPEED) VALUES('LTE', '1Mbps');
INSERT INTO DATA_SPEED (SPEED, DONE_SPEED) VALUES('LTE', '3Mbps');
INSERT INTO DATA_SPEED (SPEED, DONE_SPEED) VALUES('LTE', '5Mbps');
INSERT INTO DATA_SPEED (SPEED, DONE_SPEED) VALUES('LTE', '무제한');
COMMIT;



-- 5G 상급
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 스페셜',89000,'150GB','집/이동전화 무제한','무제한','Y',4,'80GB','normal','영상과 게임을 즐기기에 충분한 대용량 데이터 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 플러스',79000,'130GB','집/이동전화 무제한','무제한','Y',4,'70GB','normal','넉넉한 데이터를 제공하는 5G 요금제');


-- 5G 중급
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 스마트',69000,'90GB','집/이동전화 무제한','무제한','Y',3,'40GB','normal','데이터와 통화를 균형 있게 제공하는 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 데이터',65000,'80GB','집/이동전화 무제한','무제한','Y',3,'35GB','normal','일반 사용자에게 적합한 데이터 중심 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 밸런스',63000,'75GB','집/이동전화 무제한','무제한','Y',3,'30GB','normal','데이터와 통화를 균형 있게 제공');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 스탠다드',61000,'70GB','집/이동전화 무제한','무제한','Y',3,'30GB','normal','합리적인 가격의 5G 요금제');

-- 5G 보급
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 베이직+',59000,'70GB','집/이동전화 무제한','무제한','Y',2,'30GB','normal','기본적인 데이터 사용자를 위한 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 베이직',55000,'50GB','집/이동전화 무제한','무제한','Y',2,'20GB','normal','가성비 좋은 5G 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 라이트',49000,'30GB','집/이동전화 무제한','무제한','Y',2,'10GB','normal','가볍게 사용하는 5G 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 세이브',47000,'25GB','집/이동전화 무제한','무제한','Y',2,'10GB','normal','합리적인 가격의 5G 요금제');

-- 5G 저가
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 미니',39000,'15GB','집/이동전화 무제한','무제한','Y',1,'5GB','normal','부담 없는 가격의 5G 입문 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 스타터',33000,'10GB','집/이동전화 무제한','무제한','Y',1,'3GB','normal','가볍게 시작하는 5G 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 라이트 미니',31000,'8GB','집/이동전화 무제한','무제한','Y',1,'2GB','normal','소량 데이터 사용자 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 엔트리',29000,'6GB','집/이동전화 무제한','무제한','Y',1,'2GB','normal','초보 사용자용 5G 요금제');

-- LTE 프리미엄

INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 비즈니스',75000,'150GB','집/이동전화 무제한','무제한','Y',10,'80GB','normal','업무용 LTE 데이터 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 패밀리',72000,'140GB','집/이동전화 무제한','무제한','Y',10,'70GB','normal','가족 데이터 공유 요금제');

-- LTE 상급
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 스페셜',69000,'120GB','집/이동전화 무제한','무제한','Y',9,'50GB','normal','영상 시청에 적합한 LTE 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 플러스',59000,'80GB','집/이동전화 무제한','무제한','Y',9,'30GB','normal','넉넉한 데이터를 제공하는 LTE 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 스트리밍',64000,'90GB','집/이동전화 무제한','무제한','Y',9,'40GB','normal','영상 스트리밍 이용 고객을 위한 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 게임',62000,'85GB','집/이동전화 무제한','무제한','Y',9,'35GB','normal','게임 이용 고객에게 적합한 요금제');

-- LTE 중급
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 스마트',49000,'50GB','집/이동전화 무제한','무제한','Y',8,'20GB','normal','일상적인 데이터 사용에 적합');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 밸런스',47000,'45GB','집/이동전화 무제한','무제한','Y',8,'18GB','normal','균형 잡힌 LTE 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 데이터',45000,'40GB','집/이동전화 무제한','무제한','Y',8,'15GB','normal','데이터 중심 사용자 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 스탠다드',43000,'35GB','집/이동전화 무제한','무제한','Y',8,'15GB','normal','합리적인 LTE 요금제');

-- LTE 보급
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 베이직+',41000,'30GB','집/이동전화 무제한','무제한','Y',7,'12GB','normal','기본적인 LTE 데이터 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 베이직',39000,'25GB','집/이동전화 무제한','무제한','Y',7,'10GB','normal','가성비 LTE 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 라이트',33000,'15GB','집/이동전화 무제한','무제한','Y',7,'5GB','normal','가볍게 사용하는 LTE 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 세이브',31000,'12GB','집/이동전화 무제한','무제한','Y',7,'4GB','normal','저렴한 LTE 요금제');

-- LTE 저가
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 미니',29000,'10GB','집/이동전화 무제한','무제한','Y',6,'3GB','normal','최소 데이터 사용자 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 스타터',27000,'8GB','집/이동전화 무제한','무제한','Y',6,'2GB','normal','입문용 LTE 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 라이트 미니',25000,'6GB','집/이동전화 무제한','무제한','Y',6,'2GB','normal','소량 데이터 LTE 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 엔트리',23000,'5GB','집/이동전화 무제한','무제한','Y',6,'1GB','normal','가장 기본적인 LTE 요금제');

-- 5G 프리미엄
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 울트라',130000,'무제한','집/이동전화 무제한','무제한','Y',5,'150GB','popularity','최고 성능의 5G 프리미엄 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 맥스',120000,'무제한','집/이동전화 무제한','무제한','Y',5,'120GB','popularity','초고속 5G 데이터를 마음껏 사용할 수 있는 프리미엄 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 프라임',110000,'무제한','집/이동전화 무제한','무제한','Y',5,'110GB','popularity','대용량 데이터와 안정적인 속도를 제공하는 5G 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 프리미엄',100000,'무제한','집/이동전화 무제한','무제한','Y',5,'100GB','popularity','프리미엄 고객을 위한 5G 데이터 무제한 요금제');

INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 울트라',90000,'200GB','집/이동전화 무제한','무제한','Y',10,'100GB','popularity','LTE 환경에서 최대 데이터 제공');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'LTE 프리미엄',79000,'무제한','집/이동전화 무제한','무제한','Y',10,'60GB','popularity','LTE 데이터 무제한 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 스트리밍',82000,'140GB','집/이동전화 무제한','무제한','Y',4,'70GB','new','영상 스트리밍 이용 고객을 위한 요금제');
INSERT INTO PLAN VALUES (SEQ_PLAN.NEXTVAL,'5G 게임',78000,'120GB','집/이동전화 무제한','무제한','Y',4,'60GB','new','게임 이용에 최적화된 데이터 요금제');

COMMIT;
-- DATA (데이터 추가 서비스)
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('데이터 1GB 추가','데이터를 1GB 추가로 제공하는 서비스',3000,'DATA');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('데이터 3GB 추가','데이터를 3GB 추가로 제공하는 서비스',7000,'DATA');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('데이터 5GB 추가','데이터를 5GB 추가로 제공하는 서비스',9000,'DATA');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('데이터 10GB 추가','데이터를 10GB 추가로 제공하는 서비스',15000,'DATA');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('데이터 하루 무제한','하루 동안 데이터를 무제한으로 사용할 수 있는 서비스',5000,'DATA');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('야간 데이터 무제한','매일 밤 12시~아침 7시 데이터 무제한 제공',4000,'DATA');

-- OTT (콘텐츠 서비스)
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('넷플릭스 베이직','넷플릭스 베이직 요금제 이용권 제공',9500,'OTT');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('넷플릭스 스탠다드','넷플릭스 스탠다드 요금제 이용권 제공',13500,'OTT');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('유튜브 프리미엄','광고 없이 유튜브 시청 및 백그라운드 재생 제공',10450,'OTT');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('멜론 스트리밍','멜론 음악 스트리밍 이용권 제공',7900,'OTT');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('웨이브 이용권','웨이브 OTT 콘텐츠 이용 서비스',7900,'OTT');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('티빙 이용권','티빙 OTT 콘텐츠 이용 서비스',7900,'OTT');

-- SECURITY (보안 서비스)
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('스팸 전화 차단','스팸 전화 및 문자를 자동으로 차단',1000,'SECURITY');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('보이스피싱 보호','의심 전화 알림 및 차단 기능 제공',2000,'SECURITY');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('모바일 백신','스마트폰 악성코드 및 바이러스 보호 서비스',2500,'SECURITY');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('안심번호 서비스','개인 번호 대신 가상번호를 제공하는 서비스',1500,'SECURITY');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('휴대폰 위치 찾기','휴대폰 분실 시 위치를 확인할 수 있는 서비스',2000,'SECURITY');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('개인정보 보호','개인정보 유출 모니터링 서비스',3000,'SECURITY');

-- INSURANCE (단말 보험)
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('스마트폰 파손 보험','스마트폰 파손 시 수리비 일부 보장',7900,'INSURANCE');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('스마트폰 분실 보험','휴대폰 분실 시 보상 또는 교체 지원',9900,'INSURANCE');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('프리미엄 단말 보험','파손, 침수, 분실을 모두 보장하는 보험',12900,'INSURANCE');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('아이폰 전용 보험','아이폰 단말 전용 보험 서비스',13900,'INSURANCE');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('갤럭시 전용 보험','갤럭시 단말 전용 보험 서비스',12900,'INSURANCE');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('고급 스마트폰 보험','고가 스마트폰 전용 프리미엄 보험',15900,'INSURANCE');

-- ROAMING (해외 로밍)
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('로밍 데이터 1일권','해외에서 하루 동안 데이터를 이용',11000,'ROAMING');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('로밍 데이터 3일권','해외에서 3일 동안 데이터를 이용',29000,'ROAMING');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('로밍 데이터 7일권','해외에서 7일 동안 데이터를 이용',39000,'ROAMING');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('로밍 데이터 30일권','해외 장기 여행자를 위한 데이터 서비스',89000,'ROAMING');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('로밍 데이터 무제한','해외에서 데이터를 무제한으로 사용',99000,'ROAMING');
INSERT INTO ADD_SERVICE (SERVICE, CONTENT, PRICE, CATEGORY) VALUES ('로밍 음성 할인','해외 통화 요금 할인 서비스',5000,'ROAMING');

COMMIT;

INSERT INTO PAYMENT (NAME) VALUES ('가온은행');
INSERT INTO PAYMENT (NAME) VALUES ('누리은행');
INSERT INTO PAYMENT (NAME) VALUES ('다온은행');
INSERT INTO PAYMENT (NAME) VALUES ('라온은행');
INSERT INTO PAYMENT (NAME) VALUES ('미래은행');
INSERT INTO PAYMENT (NAME) VALUES ('하나온은행');
INSERT INTO PAYMENT (NAME) VALUES ('대한은행');
INSERT INTO PAYMENT (NAME) VALUES ('중앙은행');
INSERT INTO PAYMENT (NAME) VALUES ('동양은행');
INSERT INTO PAYMENT (NAME) VALUES ('서광은행');

INSERT INTO PAYMENT (NAME) VALUES ('가온카드');
INSERT INTO PAYMENT (NAME) VALUES ('누리카드');
INSERT INTO PAYMENT (NAME) VALUES ('다온카드');
INSERT INTO PAYMENT (NAME) VALUES ('라온카드');
INSERT INTO PAYMENT (NAME) VALUES ('미래카드');
INSERT INTO PAYMENT (NAME) VALUES ('대한카드');
INSERT INTO PAYMENT (NAME) VALUES ('중앙카드');
INSERT INTO PAYMENT (NAME) VALUES ('동양카드');
INSERT INTO PAYMENT (NAME) VALUES ('서광카드');
INSERT INTO PAYMENT (NAME) VALUES ('한빛카드');

INSERT INTO PAYMENT (NAME) VALUES ('스마트페이');
INSERT INTO PAYMENT (NAME) VALUES ('유니온페이');
INSERT INTO PAYMENT (NAME) VALUES ('코리아페이');
INSERT INTO PAYMENT (NAME) VALUES ('모바일페이');
INSERT INTO PAYMENT (NAME) VALUES ('스피드페이');
INSERT INTO PAYMENT (NAME) VALUES ('제로페이');
INSERT INTO PAYMENT (NAME) VALUES ('클라우드페이');
INSERT INTO PAYMENT (NAME) VALUES ('이지페이');
INSERT INTO PAYMENT (NAME) VALUES ('원페이');
INSERT INTO PAYMENT (NAME) VALUES ('플러스페이');

INSERT INTO PAYMENT (NAME) VALUES ('가온증권');
INSERT INTO PAYMENT (NAME) VALUES ('누리증권');
INSERT INTO PAYMENT (NAME) VALUES ('다온증권');
INSERT INTO PAYMENT (NAME) VALUES ('라온증권');
INSERT INTO PAYMENT (NAME) VALUES ('대한증권');
INSERT INTO PAYMENT (NAME) VALUES ('중앙증권');
INSERT INTO PAYMENT (NAME) VALUES ('동양증권');
INSERT INTO PAYMENT (NAME) VALUES ('서광증권');
INSERT INTO PAYMENT (NAME) VALUES ('한빛증권');
INSERT INTO PAYMENT (NAME) VALUES ('미래증권');

INSERT INTO MAIN_CONTRACT (TERM, DISCOUNT_RATE, PENALTY) VALUES ('12', 10, 30);
INSERT INTO MAIN_CONTRACT (TERM, DISCOUNT_RATE, PENALTY) VALUES ('24', 20, 40);
INSERT INTO MAIN_CONTRACT (TERM, DISCOUNT_RATE, PENALTY) VALUES ('36', 25, 50);

COMMIT;
--------------------------------------------------------
-- [차무식스] MEMBER 테이블 50명 더미데이터 (ADDRESS2 상세주소 포함)
--------------------------------------------------------

INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user001', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '김민수', '01050000001', '서울시 강남구 테헤란로 11', '101동 101호', 'user001@test.com', '9001011000001');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user002', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '이지영', '01050000002', '서울시 서초구 서초대로 22', '자이아파트 202동 202호', 'user002@test.com', '9202022000002');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user003', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '박서준', '01050000003', '서울시 송파구 올림픽로 33', '래미안 303동 303호', 'user003@test.com', '8803031000003');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user004', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '최지은', '01050000004', '경기도 성남시 분당구 44', '푸르지오 404동 404호', 'user004@test.com', '9504042000004');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user005', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '정도윤', '01050000005', '경기도 용인시 수지구 55', '힐스테이트 505동 505호', 'user005@test.com', '9105051000005');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user006', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '강하은', '01050000006', '서울시 강동구 천호대로 66', '롯데캐슬 606동 606호', 'user006@test.com', '9606062000006');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user007', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '조시우', '01050000007', '서울시 마포구 월드컵로 77', '아이파크 707동 707호', 'user007@test.com', '8907071000007');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user008', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '윤서연', '01050000008', '서울시 종로구 세종대로 88', '2층 201호', 'user008@test.com', '9308082000008');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user009', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '장지훈', '01050000009', '서울시 용산구 이태원로 99', '3층 302호', 'user009@test.com', '9009091000009');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user010', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '임수아', '01050000010', '서울시 광진구 아차산로 10', 'A동 401호', 'user010@test.com', '9410102000010');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user011', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '한우진', '01050000011', '인천시 연수구 컨벤시아대로 11', 'B동 502호', 'user011@test.com', '8511111000011');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user012', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '오유진', '01050000012', '부산시 해운대구 달맞이길 12', '센트럴파크 101동 1201호', 'user012@test.com', '9712122000012');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user013', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '신도현', '01050000013', '대구시 수성구 동대구로 13', '더샵 102동 1302호', 'user013@test.com', '9101131000013');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user014', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '서하린', '01050000014', '대전시 유성구 대학로 14', 'SK뷰 103동 1403호', 'user014@test.com', '9502142000014');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user015', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '권준서', '01050000015', '광주시 서구 상무대로 15', '호반베르디움 104동 1504호', 'user015@test.com', '8803151000015');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user016', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '황지아', '01050000016', '울산시 남구 삼산로 16', '101동 1601호', 'user016@test.com', '9204162000016');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user017', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '안도윤', '01050000017', '제주시 노형로 17', '201동 1702호', 'user017@test.com', '9005171000017');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user018', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '송아인', '01050000018', '수원시 팔달구 매산로 18', '301동 1803호', 'user018@test.com', '9606182000018');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user019', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '전민재', '01050000019', '고양시 일산동구 정발산로 19', '일산위브 401동 1904호', 'user019@test.com', '8907191000019');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user020', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '홍유나', '01050000020', '창원시 성산구 원이대로 20', '501동 2005호', 'user020@test.com', '9408202000020');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user021', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '고시윤', '01050000021', '서울시 영등포구 여의대로 21', '여의도자이 101동 2101호', 'user021@test.com', '8709211000021');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user022', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '문시아', '01050000022', '서울시 구로구 디지털로 22', '구로디지털 102동 2202호', 'user022@test.com', '9810222000022');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user023', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '양준호', '01050000023', '서울시 동작구 노량진로 23', '동작래미안 103동 2303호', 'user023@test.com', '9111231000023');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user024', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '손지유', '01050000024', '서울시 관악구 남부순환로 24', '104동 2404호', 'user024@test.com', '9512242000024');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user025', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '배건우', '01050000025', '서울시 성동구 왕십리로 25', '성동푸르지오 105동 2505호', 'user025@test.com', '8901251000025');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user026', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '백다은', '01050000026', '서울시 성북구 보문로 26', '보문파크뷰 106동 2606호', 'user026@test.com', '9202262000026');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user027', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '허은우', '01050000027', '서울시 동대문구 천호대로 27', '청량리역롯데캐슬 107동 2707호', 'user027@test.com', '9003271000027');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user028', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '남소율', '01050000028', '서울시 중랑구 망우로 28', '상봉프레미어스 108동 2808호', 'user028@test.com', '9604282000028');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user029', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '심재윤', '01050000029', '서울시 노원구 동일로 29', '노원센트럴 109동 2909호', 'user029@test.com', '8805291000029');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user030', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '노하윤', '01050000030', '서울시 강북구 도봉로 30', '미아래미안 110동 3010호', 'user030@test.com', '9306302000030');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user031', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '곽도훈', '01050000031', '서울시 은평구 통일로 31', '은평뉴타운 111동 3111호', 'user031@test.com', '9107011000031');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user032', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '성지안', '01050000032', '서울시 서대문구 신촌로 32', '신촌푸르지오 112동 3212호', 'user032@test.com', '9508022000032');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user033', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '차우진', '01050000033', '서울시 양천구 목동로 33', '목동센트럴 113동 3313호', 'user033@test.com', '8909031000033');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user034', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '우서윤', '01050000034', '서울시 강서구 공항대로 34', '마곡엠밸리 114동 3414호', 'user034@test.com', '9410042000034');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user035', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '구하준', '01050000035', '부천시 길주로 35', '중동센트럴파크 115동 3515호', 'user035@test.com', '9011051000035');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user036', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '신아린', '01050000036', '안양시 동안구 시민대로 36', '평촌더샵 116동 3616호', 'user036@test.com', '9712062000036');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user037', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '임건우', '01050000037', '안산시 단원구 중앙대로 37', '안산푸르지오 117동 3717호', 'user037@test.com', '8801071000037');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user038', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '전지우', '01050000038', '남양주시 경춘로 38', '다산자이 118동 3818호', 'user038@test.com', '9302082000038');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user039', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '류준영', '01050000039', '평택시 평택로 39', '고덕파라곤 119동 3919호', 'user039@test.com', '9103091000039');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user040', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '강소율', '01050000040', '파주시 평화로 40', '운정센트럴 120동 4020호', 'user040@test.com', '9504102000040');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user041', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '오승우', '01050000041', '시흥시 시흥대로 41', '배곧스카이 121동 4121호', 'user041@test.com', '8905111000041');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user042', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '한채원', '01050000042', '김포시 김포대로 42', '걸포메트로자이 122동 4222호', 'user042@test.com', '9606122000042');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user043', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '권민찬', '01050000043', '화성시 동탄대로 43', '동탄린스트라우스 123동 4323호', 'user043@test.com', '9007131000043');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user044', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '황서현', '01050000044', '포항시 남구 포스코대로 44', '포항자이 124동 4424호', 'user044@test.com', '9208142000044');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user045', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '송연우', '01050000045', '구미시 구미대로 45', '구미아이파크 125동 4525호', 'user045@test.com', '8709151000045');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user046', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '안예은', '01050000046', '진주시 진주대로 46', '진주혁신도시 126동 4626호', 'user046@test.com', '9410162000046');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user047', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '조현우', '01050000047', '원주시 원일로 47', '원주기업도시 127동 4727호', 'user047@test.com', '9111171000047');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user048', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '윤다인', '01050000048', '춘천시 영서로 48', '춘천센트럴 128동 4828호', 'user048@test.com', '9812182000048');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user049', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '최도현', '01050000049', '강릉시 경강로 49', '강릉유천 129동 4929호', 'user049@test.com', '8901191000049');
INSERT INTO MEMBER (ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, RESIDENT) VALUES ('user050', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '이서아', '01050000050', '천안시 서북구 번영로 50', '천안불당지웰 130동 5030호', 'user050@test.com', '9502202000050');

COMMIT;

-- JOB
INSERT INTO JOB (JOB_NAME) VALUES ('관리자');
INSERT INTO JOB (JOB_NAME) VALUES ('점장');
INSERT INTO JOB (JOB_NAME) VALUES ('부점장');
INSERT INTO JOB (JOB_NAME) VALUES ('상담원');
INSERT INTO JOB (JOB_NAME) VALUES ('매니저');
-- AGENCY
INSERT INTO AGENCY (NAME, PHONE, ADDRESS)
VALUES ('강남점', '0211112222', '서울특별시 강남구 테헤란로 14길 6');

INSERT INTO AGENCY (NAME, PHONE, ADDRESS)
VALUES ('서초점', '0222223333', '서울특별시 서초구 서초대로 77');

INSERT INTO AGENCY (NAME, PHONE, ADDRESS)
VALUES ('송파점', '0233334444', '서울특별시 송파구 올림픽로 300');

INSERT INTO AGENCY (NAME, PHONE, ADDRESS)
VALUES ('마포점', '0244445555', '서울특별시 마포구 월드컵북로 21');

INSERT INTO AGENCY (NAME, PHONE, ADDRESS)
VALUES ('영등포점', '0255556666', '서울특별시 영등포구 여의대로 12');

-- EMPLOYEE
INSERT INTO EMPLOYEE
(AGENCY_NO, ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, JOB_NO, RESIDENT, SALARY)
VALUES
(1, 'admin01', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '김국비', '01012345678', '서울특별시 강남구', '테헤란로 14길 6 남도빌딩 5층', 'admin01@test.com', 1, '9612231234567', 3500000);

INSERT INTO EMPLOYEE
(AGENCY_NO, ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, JOB_NO, RESIDENT, SALARY)
VALUES
(1, 'employee01', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '안국비', '01012348756', '서울특별시 강남구', '테헤란로 14길 6 남도빌딩 2층', 'employee01@test.com', 4, '9611131234567', 2200000);

INSERT INTO EMPLOYEE
(AGENCY_NO, ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, JOB_NO, RESIDENT, SALARY)
VALUES
(2, 'manager02', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '박서초', '01022223333', '서울특별시 서초구', '서초대로 77 3층', 'manager02@test.com', 2, '9001011234567', 3000000);

INSERT INTO EMPLOYEE
(AGENCY_NO, ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, JOB_NO, RESIDENT, SALARY)
VALUES
(2, 'employee02', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '최서초', '01023456789', '서울특별시 서초구', '서초대로 77 2층', 'employee02@test.com', 4, '9505051234567', 2100000);

INSERT INTO EMPLOYEE
(AGENCY_NO, ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, JOB_NO, RESIDENT, SALARY)
VALUES
(3, 'manager03', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '이송파', '01034567890', '서울특별시 송파구', '올림픽로 300 4층', 'manager03@test.com', 2, '9207071234567', 3000000);

INSERT INTO EMPLOYEE
(AGENCY_NO, ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, JOB_NO, RESIDENT, SALARY)
VALUES
(3, 'employee03', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '정송파', '01045678901', '서울특별시 송파구', '올림픽로 300 2층', 'employee03@test.com', 3, '9808081234567', 2400000);

INSERT INTO EMPLOYEE
(AGENCY_NO, ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, JOB_NO, RESIDENT, SALARY)
VALUES
(4, 'manager04', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '한마포', '01056789012', '서울특별시 마포구', '월드컵북로 21 5층', 'manager04@test.com', 2, '9309091234567', 3000000);

INSERT INTO EMPLOYEE
(AGENCY_NO, ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, JOB_NO, RESIDENT, SALARY)
VALUES
(4, 'employee04', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '오마포', '01067890123', '서울특별시 마포구', '월드컵북로 21 2층', 'employee04@test.com', 4, '9901012234567', 2100000);

INSERT INTO EMPLOYEE
(AGENCY_NO, ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, JOB_NO, RESIDENT, SALARY)
VALUES
(5, 'manager05', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '윤영등포', '01078901234', '서울특별시 영등포구', '여의대로 12 6층', 'manager05@test.com', 2, '9403031234567', 3000000);

INSERT INTO EMPLOYEE
(AGENCY_NO, ID, PW, NAME, PHONE, ADDRESS, ADDRESS2, EMAIL, JOB_NO, RESIDENT, SALARY)
VALUES
(5, 'employee05', '$2a$10$EVZuU.GSGNsps.cMe3eA0eH/A0WsNX3AdqiBk7qKXQ4KSvIImCNE6', '임영등포', '01089012345', '서울특별시 영등포구', '여의대로 12 3층', 'employee05@test.com', 5, '9704041234567', 2300000);

-- AGENCY manager update
UPDATE AGENCY SET MANAGER_NO = 1 WHERE NO = 1;
UPDATE AGENCY SET MANAGER_NO = 3 WHERE NO = 2;
UPDATE AGENCY SET MANAGER_NO = 5 WHERE NO = 3;
UPDATE AGENCY SET MANAGER_NO = 7 WHERE NO = 4;
UPDATE AGENCY SET MANAGER_NO = 9 WHERE NO = 5;

commit;

BEGIN
  FOR i IN 2..21 LOOP
    INSERT INTO ACCOUNT (
        NO,
        ACCOUNT_NUMBER,
        PAYMENT_NO
    ) VALUES (
        SEQ_ACCOUNT.NEXTVAL,
        '1234' || LPAD(i, 12, '0'), -- 16자리 가짜 계좌번호
        FLOOR(DBMS_RANDOM.VALUE(1, 41)) -- PAYMENT_NO 1~40 랜덤
    );
  END LOOP;
  COMMIT;
END;
/

DECLARE
    -- 실제 존재하는 번호들을 담을 변수
    TYPE num_tab IS TABLE OF NUMBER INDEX BY BINARY_INTEGER;
    v_mem_nos num_tab;
    v_plan_nos num_tab;
    v_contract_nos num_tab;
    
    v_line_count NUMBER;
    v_phone_suffix NUMBER := 1000;
    
    -- 랜덤 선택된 값을 담을 임시 변수
    v_selected_plan_no NUMBER;
    v_selected_contract_no NUMBER;
BEGIN
    -- 1. 실제 존재하는 부모 키들 추출
    SELECT NO BULK COLLECT INTO v_mem_nos FROM (SELECT NO FROM MEMBER ORDER BY DBMS_RANDOM.VALUE) WHERE ROWNUM <= 15;
    SELECT NO BULK COLLECT INTO v_plan_nos FROM PLAN;
    SELECT NO BULK COLLECT INTO v_contract_nos FROM MAIN_CONTRACT;

    FOR i IN 1..v_mem_nos.COUNT LOOP
        -- 회원당 1~3개 회선
        v_line_count := FLOOR(DBMS_RANDOM.VALUE(1, 4)); 

        FOR j IN 1..v_line_count LOOP
            v_phone_suffix := v_phone_suffix + 1;
            
            -- SQL 엔진이 이해할 수 있도록 변수에 미리 할당 (핵심 수정 사항)
            v_selected_plan_no := v_plan_nos(FLOOR(DBMS_RANDOM.VALUE(1, v_plan_nos.COUNT + 1)));
            v_selected_contract_no := v_contract_nos(FLOOR(DBMS_RANDOM.VALUE(1, v_contract_nos.COUNT + 1)));
            
            -- ACCOUNT 생성
            INSERT INTO ACCOUNT (NO, ACCOUNT_NUMBER, PAYMENT_NO)
            VALUES (SEQ_ACCOUNT.NEXTVAL, '9876' || LPAD(v_mem_nos(i), 8, '0') || LPAD(j, 4, '0'), FLOOR(DBMS_RANDOM.VALUE(1, 41)));

            -- FIXED_INFO 생성
            INSERT INTO FIXED_INFO (
                NO,
                MEMBER_NO,
                PHONE,
                CREATED_AT,
                MAIN_CONTRACT_END_DATE,
                ACCOUNT_NO,
                MAIN_CONTRACT_NO,
                PLAN_NO,
                ACTIVE_YN
            ) VALUES (
                SEQ_FIXED_INFO.NEXTVAL,
                v_mem_nos(i),
                '010' || '9999' || LPAD(v_phone_suffix, 4, '0'), 
                SYSDATE - FLOOR(DBMS_RANDOM.VALUE(1, 365)),
                TO_CHAR(ADD_MONTHS(SYSDATE, FLOOR(DBMS_RANDOM.VALUE(6, 36))), 'YYYYMMDD'),
                SEQ_ACCOUNT.CURRVAL,
                v_selected_contract_no, -- 변수 사용
                v_selected_plan_no,      -- 변수 사용
                CASE WHEN DBMS_RANDOM.VALUE < 0.7 THEN 'Y' ELSE 'N' END
            );
        END LOOP;
    END LOOP;
    COMMIT;
END;
/

DECLARE
    -- 회선 번호 리스트
    TYPE num_tab IS TABLE OF NUMBER INDEX BY BINARY_INTEGER;
    v_fixed_nos num_tab;
    
    -- 생성할 월 리스트 (25년 11월 ~ 26년 3월)
    TYPE month_tab IS TABLE OF VARCHAR2(6);
    v_months month_tab := month_tab(
        '202511', '202512', '202601', '202602', '202603'
    );
    
    v_inserted_count NUMBER := 0;
BEGIN
    -- 1. 현재 존재하는 모든 가입 정보(FIXED_INFO) 가져오기
    SELECT NO BULK COLLECT INTO v_fixed_nos FROM FIXED_INFO;

    -- 2. 각 회선별로 5개월치 데이터 생성
    FOR i IN 1..v_fixed_nos.COUNT LOOP
        FOR m IN 1..v_months.COUNT LOOP
            
            -- 중복 방지: 이미 해당 월의 데이터가 있다면 건너뜀 (선택 사항)
            -- DELETE FROM PLAN_CONTRACT WHERE FIXED_NO = v_fixed_nos(i) AND USED_MONTH = v_months(m);

            INSERT INTO PLAN_CONTRACT (
                NO,
                FIXED_NO,
                USED_DATA,
                USED_VOICE,
                USED_SMS,
                USED_MONTH,
                PERSONAL_PLAN_NO
            ) VALUES (
                SEQ_PLAN_CONTRACT.NEXTVAL,
                v_fixed_nos(i),
                -- 최근 데이터니까 사용량을 조금 더 넉넉하게 (2,000 ~ 60,000 MB)
                FLOOR(DBMS_RANDOM.VALUE(2000, 60001)), 
                -- 통화량 (30 ~ 500 분)
                FLOOR(DBMS_RANDOM.VALUE(30, 501)),    
                -- 문자 (10 ~ 200 건)
                FLOOR(DBMS_RANDOM.VALUE(10, 201)),    
                -- 연도/월
                v_months(m),
                -- 가입된 요금제 번호 자동 매칭
                (SELECT PLAN_NO FROM FIXED_INFO WHERE NO = v_fixed_nos(i))
            );
            
            v_inserted_count := v_inserted_count + 1;
        END LOOP;
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('25년 11월 ~ 26년 3월 데이터 ' || v_inserted_count || '건 생성 완료!');
END;
/

DECLARE
    -- 1. 커서를 단순화 (조인 제거, FIXED_INFO만 참조)
    CURSOR c_fixed IS
        SELECT 
            NO AS fixed_no, 
            PLAN_NO
        FROM FIXED_INFO;
        
    v_month VARCHAR2(6);
    v_usage_data NUMBER;
BEGIN
    FOR rec IN c_fixed LOOP
        -- 2. 최근 3개월치 데이터 생성 (202601 ~ 202603)
        FOR m IN 1..3 LOOP
            v_month := '2026' || LPAD(m, 2, '0');
            
            -- 요금제 한도를 모르더라도 일반적인 가용 범위(1GB~20GB) 내에서 랜덤 생성
            v_usage_data := FLOOR(DBMS_RANDOM.VALUE(1024, 20480));

            INSERT INTO PLAN_CONTRACT (
                NO,
                FIXED_NO,
                USED_DATA,
                USED_VOICE,
                USED_SMS,
                USED_MONTH,
                PERSONAL_PLAN_NO
            ) VALUES (
                SEQ_PLAN_CONTRACT.NEXTVAL,
                rec.fixed_no,        -- 부모 키(FIXED_INFO) 완벽 연동
                v_usage_data,
                FLOOR(DBMS_RANDOM.VALUE(10, 200)), -- 음성 10~200분
                FLOOR(DBMS_RANDOM.VALUE(0, 50)),   -- 문자 0~50건
                v_month,
                rec.PLAN_NO          -- 현재 가입된 요금제 번호 그대로 사용
            );
        END LOOP;
    END LOOP;
    
    COMMIT;
END;
/

DECLARE
    -- 설정값
    V_MAX_ROWS NUMBER := 100; -- 생성할 데이터 건수
BEGIN

    INSERT INTO SERVICE_INSERT_CONFIRM (
        NO, 
        EMPLOYEE_NO, 
        SERVICE_NO, 
        FIXED_NO, 
        CONFIRM_AT, 
        CONFIRM_STATUS
    )
    WITH RAW_DATA AS (
        -- 중복되지 않는 FIXED_NO와 SERVICE_NO 조합 생성
        SELECT 
            F_NO, 
            S_NO,
            ROW_NUMBER() OVER (ORDER BY DBMS_RANDOM.VALUE) as RN
        FROM (SELECT LEVEL F_NO FROM DUAL CONNECT BY LEVEL <= 20) -- FIXED_NO 1~20
        CROSS JOIN (SELECT LEVEL S_NO FROM DUAL CONNECT BY LEVEL <= 30) -- SERVICE_NO 1~30
    )
    SELECT 
        SEQ_SERVICE_INSERT_CONFIRM.NEXTVAL,
        CASE 
            WHEN STATUS_SEED < 0.3 THEN NULL -- 30% 확률로 대기(A) 상태, 직원 NULL
            ELSE TRUNC(DBMS_RANDOM.VALUE(1, 3)) -- 70% 확률로 처리 완료, 직원 1~10번
        END as EMPLOYEE_NO,
        S_NO as SERVICE_NO,
        F_NO as FIXED_NO,
        CASE 
            WHEN STATUS_SEED < 0.3 THEN NULL -- A 상태면 처리일시 NULL
            ELSE SYSDATE - DBMS_RANDOM.VALUE(0, 30) -- 완료면 최근 30일내 랜덤 시간
        END as CONFIRM_AT,
        CASE 
            WHEN STATUS_SEED < 0.3 THEN 'A'
            WHEN STATUS_SEED < 0.7 THEN 'Y'
            ELSE 'N'
        END as CONFIRM_STATUS
    FROM (
        SELECT F_NO, S_NO, DBMS_RANDOM.VALUE as STATUS_SEED
        FROM RAW_DATA
        WHERE RN <= V_MAX_ROWS -- 원하는 건수만큼 추출
    );

    COMMIT;
    DBMS_OUTPUT.PUT_LINE(V_MAX_ROWS || ' rows inserted into SERVICE_INSERT_CONFIRM.');
END;
/


