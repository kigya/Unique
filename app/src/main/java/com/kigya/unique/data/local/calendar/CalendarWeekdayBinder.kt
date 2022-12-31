package com.kigya.unique.data.local.calendar

import android.view.View
import com.kizitonwose.calendar.core.WeekDay
import com.kizitonwose.calendar.view.WeekCalendarView
import com.kizitonwose.calendar.view.WeekDayBinder

class CalendarWeekdayBinder(
    private val calendarView: WeekCalendarView,
    private val clickListener: CalendarWeekdayClickListener,
    private val dateBinder: CalendarDateBinder
) : WeekDayBinder<CalendarWeekdayViewContainer> {
    override fun create(view: View): CalendarWeekdayViewContainer =
        CalendarWeekdayViewContainer(view, calendarView, clickListener)

    override fun bind(container: CalendarWeekdayViewContainer, data: WeekDay) {
        with(container) {
            weekDay = data
            dateBinder.bindDate(data.date, tvDay, tvWeekDay, wrapper)
        }

    }
}