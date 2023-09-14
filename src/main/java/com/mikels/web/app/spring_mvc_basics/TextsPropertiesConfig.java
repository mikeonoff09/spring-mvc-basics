

package com.mikels.web.app.spring_mvc_basics;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    @PropertySource("classpath:texts.properties")// Split with coma to add more sources
})
public class TextsPropertiesConfig {

}