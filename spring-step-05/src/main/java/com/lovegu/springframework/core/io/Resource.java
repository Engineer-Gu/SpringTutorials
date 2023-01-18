package com.lovegu.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 老顾
 * @description 资源加载接口。主要用于处理资源加载流
 * @date 2023/1/18
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
