package com.lovegu.springframework.io;

import cn.hutool.core.lang.Assert;
import com.lovegu.springframework.utils.ClassUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 老顾
 * @description 流文件的实现一：通过ClasLoader读取类的ClassPath文件信息
 * @date 2023/1/18
 */
public class ClassPathResource implements Resource{

    private final String path;

    private final ClassLoader classLoader;

    public ClassPathResource(String path) {
        this(path, null);
    }

    public ClassPathResource(String path, ClassLoader classLoader) {
        Assert.notNull(path, "Path must not be null");
        this.path = path;
        this.classLoader = (classLoader != null ? classLoader : ClassUtils.getDefaultClassLoader());
    }

    @Override
    public InputStream getInputStream() throws IOException {
        InputStream is = classLoader.getResourceAsStream(path);
        if (is == null) {
            throw new FileNotFoundException(
                    this.path + "cannot be opened because it does not exist");
        }
        return is;
    }
}
