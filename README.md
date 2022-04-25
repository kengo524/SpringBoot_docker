# spring_boot

#セットアップ方法

- git clone
- cd spring_boot

## コンテナ起動

- docker-compose up -d

## ビルド

- docker-compose exec app sh gradlew build

## web サーバー立ち上げ

- ls build/libs にて出力された名前にplainがないjarファイルの名前をコピー
- docker-compose exec app java -jar build/libs/コピーしたファイル名を貼り付け。

## 画面確認

- localhost:8080 にて Hello world が出力される。

## コンテナ停止

- docker-compose down
