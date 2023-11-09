# Roman

Let's have some fun converting roman numerals to & fro.

## Tech
- Java 17
- Spring Boot 3.1.5

## Future
- Error Handling
- Implement Roman Numeral to Integer Service

## API Reference

#### Get roman numeral representation of an integer

```http
  GET /convert/integer/${value}
```

| Parameter | Type     | Description                                           |
|:----------| :------- |:------------------------------------------------------|
| `value`   | `string` | **Required**. Integer to convert into a Roman Numeral |


#### Get integer representation of a roman numeral

```http
  GET /convert/roman/${value}
```

| Parameter | Type     | Description                                           |
|:----------| :------- |:------------------------------------------------------|
| `value`   | `string` | **Required**. Roman Numeral to convert into a Integer |


## Author

- [@nvardell](https://www.github.com/nvardell)
