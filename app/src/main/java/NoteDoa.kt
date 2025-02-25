import androidx.lifecycle.LiveData
import androidx.room.*
import com.ezzy.notepad.Note

@Dao
interface NoteDao {
    @Insert
    suspend fun insert(note: Note)

    @Update
    suspend fun update(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("SELECT * FROM notes ORDER BY timestamp DESC")
    fun getAllNotes(): LiveData<List<Note>> // Fetch all notes sorted by timestamp
}
