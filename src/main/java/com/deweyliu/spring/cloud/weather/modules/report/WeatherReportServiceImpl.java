package com.deweyliu.spring.cloud.weather.modules.report;

import com.deweyliu.spring.cloud.weather.modules.weather.Forecast;
import com.deweyliu.spring.cloud.weather.modules.weather.Weather;
import com.deweyliu.spring.cloud.weather.modules.weather.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Weather Report Service
 *
 * @author DeweyLiu
 * @version 1.0.0
 * @date 2018/12/16 14:23
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Override
    public Weather getDataByCityId(String cityId) {
        // TODO 改为由天气数据API微服务来提供
        Weather data = new Weather();
        data.setAqi("21");
        data.setCity("深圳");
        data.setGanmao("容易感冒！多穿衣");
        data.setWendu("18");

        List<Forecast> forecastList = new ArrayList<>();

        Forecast forecast = new Forecast();
        forecast.setDate("17日星期天");
        forecast.setType("晴");
        forecast.setFengxiang("无风");
        forecast.setHigh("高温 11度");
        forecast.setLow("低温 1度");
        forecastList.add(forecast);

        forecast = new Forecast();
        forecast.setDate("19日星期天");
        forecast.setType("晴");
        forecast.setFengxiang("无风");
        forecast.setHigh("高温 11度");
        forecast.setLow("低温 1度");
        forecastList.add(forecast);

        forecast = new Forecast();
        forecast.setDate("20日星期天");
        forecast.setType("晴");
        forecast.setFengxiang("无风");
        forecast.setHigh("高温 11度");
        forecast.setLow("低温 1度");
        forecastList.add(forecast);

        forecast = new Forecast();
        forecast.setDate("21日星期天");
        forecast.setType("晴");
        forecast.setFengxiang("无风");
        forecast.setHigh("高温 11度");
        forecast.setLow("低温 1度");
        forecastList.add(forecast);

        forecast = new Forecast();
        forecast.setDate("22日星期天");
        forecast.setType("晴");
        forecast.setFengxiang("无风");
        forecast.setHigh("高温 11度");
        forecast.setLow("低温 1度");
        forecastList.add(forecast);

        data.setForecast(forecastList);
        return data;
    }
}
