package uz.ttpu.movieshelf.data.mapper

import uz.ttpu.movieshelf.data.remote.MovieDto
import uz.ttpu.movieshelf.domain.model.Movie

fun MovieDto.toDomain(isFavorite: Boolean): Movie = Movie(
    id = id,
    title = title,
    year = releaseYear,    // releaseYear becomes year
    rating = score,        // score becomes rating
    isFavorite = isFavorite,
)