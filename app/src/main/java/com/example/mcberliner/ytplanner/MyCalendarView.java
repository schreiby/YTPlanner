package com.example.mcberliner.ytplanner;

import android.app.Service;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Locale;
import com.example.mcberliner.ytplanner.JewishCalendar;

/**
 * Created by mcberliner on 6/28/2015.
 */

@Widget
public class MyCalendarView extends CalendarView {

    private ViewGroup mDayNamesHeader;
    private ListView mListView;
    private TextView mMonthName;

    protected Context mContext;

    public MyCalendarView() {

        super(Context context, AttributeSet attrs, int defStyle){
            super(context, attrs, 0);

            // initialization based on locale
            //setCurrentLocale(Locale.getDefault());

            /**TypedArray attributesArray = context.obtainStyledAttributes(attrs, R.styleable.CalendarView, R.attr.calendarViewStyle, 0);
            mShowWeekNumber = attributesArray.getBoolean(R.styleable.CalendarView_showWeekNumber, DEFAULT_SHOW_WEEK_NUMBER);
            mFirstDayOfWeek = attributesArray.getInt(R.styleable.CalendarView_firstDayOfWeek, LocaleData.get(Locale.getDefault()).firstDayOfWeek);
            String minDate = attributesArray.getString(R.styleable.CalendarView_minDate);
            if (TextUtils.isEmpty(minDate) || !parseDate(minDate, mMinDate)) {
                parseDate(DEFAULT_MIN_DATE, mMinDate);
            }
            String maxDate = attributesArray.getString(R.styleable.CalendarView_maxDate);
            if (TextUtils.isEmpty(maxDate) || !parseDate(maxDate, mMaxDate)) {
                parseDate( /, DEFAULT_MAX_DATE, mMaxDate);
            }
            if (mMaxDate.before(mMinDate)) {
                throw new IllegalArgumentException("Max date cannot be before min date.");
            }
            mShownWeekCount = attributesArray.getInt(R.styleable.CalendarView_shownWeekCount, DEFAULT_SHOWN_WEEK_COUNT);
            mSelectedWeekBackgroundColor = attributesArray.getColor(R.styleable.CalendarView_selectedWeekBackgroundColor, 0);
            mFocusedMonthDateColor = attributesArray.getColor(R.styleable.CalendarView_focusedMonthDateColor, 0);
            mUnfocusedMonthDateColor = attributesArray.getColor(R.styleable.CalendarView_unfocusedMonthDateColor, 0);
            mWeekSeparatorLineColor = attributesArray.getColor(R.styleable.CalendarView_weekSeparatorLineColor, 0);
            mWeekNumberColor = attributesArray.getColor(R.styleable.CalendarView_weekNumberColor, 0);
            mSelectedDateVerticalBar = attributesArray.getDrawable(R.styleable.CalendarView_selectedDateVerticalBar);

            int dateTextAppearanceResId = attributesArray.getResourceId(R.styleable.CalendarView_dateTextAppearance, R.style.TextAppearance_Small);
            TypedArray dateTextAppearance = context.obtainStyledAttributes(dateTextAppearanceResId, com.android.internal.R.styleable.TextAppearance);
            mDateTextSize = dateTextAppearance.getDimensionPixelSize(R.styleable.TextAppearance_textSize, DEFAULT_DATE_TEXT_SIZE);
            dateTextAppearance.recycle();

            int weekDayTextAppearanceResId = attributesArray.getResourceId(R.styleable.CalendarView_weekDayTextAppearance, DEFAULT_WEEK_DAY_TEXT_APPEARANCE_RES_ID);
            attributesArray.recycle();

            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            mWeekMinVisibleHeight = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, UNSCALED_WEEK_MIN_VISIBLE_HEIGHT, displayMetrics);
            mListScrollTopOffset = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, UNSCALED_LIST_SCROLL_TOP_OFFSET, displayMetrics);
            mBottomBuffer = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, UNSCALED_BOTTOM_BUFFER, displayMetrics);
            mSelectedDateVerticalBarWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, UNSCALED_SELECTED_DATE_VERTICAL_BAR_WIDTH, displayMetrics);
            mWeekSeperatorLineWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, UNSCALED_WEEK_SEPARATOR_LINE_WIDTH, displayMetrics); */

            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
            View content = layoutInflater.inflate(R.layout.calendar_view, null, false);
            addView(content);

            mListView = (ListView) findViewById(R.id.list);
            mDayNamesHeader = (ViewGroup) content.findViewById(com.android.internal.R.id.day_names);
            mMonthName = (TextView) content.findViewById(com.android.internal.R.id.month_name);

            //setUpHeader(weekDayTextAppearanceResId);
            //setUpListView();
            //setUpAdapter();

            // go to today or whichever is close to today min or max date
            /**mTempDate.setTimeInMillis(System.currentTimeMillis());
            if (mTempDate.before(mMinDate)) {
                goTo(mMinDate, false, true, true);
            } else if (mMaxDate.before(mTempDate)) {
                goTo(mMaxDate, false, true, true);
            } else {
                goTo(mTempDate, false, true, true);
            } */

            invalidate();
        }
    }
}
