# spring_boot

#セットアップ方法
- git clone
- cd spring_boot

## コンテナ起動
- docker-compose up -d

## ビルド
- docker-compose exec app sh gradlew build

## webサーバー立ち上げ
- docker-compose exec app java -jar build/libs/api-0.0.1-SNAPSHOT.jar

## コンテナ停止
- docker-compose down

