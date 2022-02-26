package com.huang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Book
 * @Description TODO
 * @Author huangbo1221
 * @Date 2022/2/26 21:29
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int bookId;

    private String bookName;

    private int bookCounts;

    private String detail;
}
