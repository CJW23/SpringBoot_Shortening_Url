package com.cjw.shorturl.service;

import com.cjw.shorturl.dto.DayChartDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{
    @Override
    public int adminTotalUrlCount() {
        return 0;
    }

    @Override
    public int adminTotalUserCount() {
        return 0;
    }

    @Override
    public int adminTotalUrlAccessCount() {
        return 0;
    }

    @Override
    public List<DayChartDTO> adminDayUrlCount() {
        return null;
    }

    @Override
    public List<DayChartDTO> adminDayUserCount() {
        return null;
    }

    @Override
    public int adminRemoveUser(int userId) {
        return 0;
    }

    @Override
    public int adminGiveAuth(int userId) {
        return 0;
    }

    @Override
    public int adminWithdrawAuth(int userId) {
        return 0;
    }

    @Override
    public int adminRemoveUrl(int urlId) {
        return 0;
    }

    @Override
    public int adminSaveBanUrl(String url) {
        return 0;
    }

    @Override
    public int adminRemoveBanUrl(int banUrlId) {
        return 0;
    }

    @Override
    public List<DayChartDTO> adminDayAccessUrlCount() {
        return null;
    }
}
