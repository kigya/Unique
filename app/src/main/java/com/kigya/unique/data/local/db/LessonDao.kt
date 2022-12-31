package com.kigya.unique.data.local.db

import androidx.room.*
import com.kigya.unique.data.dto.lesson.Lesson
import kotlinx.coroutines.flow.Flow

@Dao
interface LessonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertLessons(rows: List<Lesson>)

    @Query("SELECT * FROM lessons")
    fun getAllLessons(): Flow<List<Lesson>>

    @Query("DELETE FROM lessons")
    suspend fun deleteAllLessons()

    @Query(
        "SELECT * FROM lessons WHERE `group` = :group AND `course` = :course" +
                " AND (:day IS NULL OR `day` = :day)" +
                " AND (:subgroup IS NULL OR `subgroup` = :subgroup)" +
                " AND (:regularity IS NULL OR `regularity` = :regularity)"
    )
    fun getLessons(
        course: Int,
        group: Int,
        day: String? = null,
        subgroup: String? = null,
        regularity: String? = null
    ): Flow<List<Lesson>>

}